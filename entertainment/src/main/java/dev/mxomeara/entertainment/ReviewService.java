package dev.mxomeara.entertainment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String reviewBody, String imdbId){ //use imdb id to find movie and then make review
        Review review = new Review(reviewBody);
        reviewRepository.insert(review); //Currently we have an empty array for each movie for reviews so this will push reviews to it
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review)) //This checks if the imdbId matches the one inputted from the user if it does it will apply the update and push the new review
                .first();
        return review;
    }
}
