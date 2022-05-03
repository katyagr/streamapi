package org.example.streamapi;

import org.example.streamapi.model.Bodybuilder;
import org.example.streamapi.model.Friend;
import org.example.streamapi.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.example.streamapi.model.User.GENDER.UNKNOWN;

public class Extension {
    /*
        Given two int numbers a and b, return int [] with values that are in the range between smaller and bigger arg:
        - use IntStream.range
        - swap the argument's values without introducing a new, local variable.
    */
    public int [] streamNumbers(int a, int b) {
        // Implement me :)
        int [] arrayAB = IntStream.range(a, b).toArray();
        int [] arrayBA = IntStream.range(b, a).toArray();
        if (Arrays.stream(arrayBA).count() > 0){
            return arrayBA;
        } else {
            return arrayAB;
        }
    }

    /*
        Given a list of users, return a User with the given user id. If there is no user with this id,
        return new user with the name "New user", given id, gender "unknown".

        (use Optional API)
    */
    public User getUserByIdOrCreateNew(List<User> users, long userId) {
//        Optional<String> checkUser = Optional.ofNullable(users
//                .stream()
//                .filter(u -> u.getId() == userId)
//                .toString());
//        if (checkUser.isPresent()){
//            User user =; //need to filter for the user with matching userid but can't get matching return types?
//            return user;
//        } else {
//            User user = new User(userId, "New user", UNKNOWN);
//            return user;
//        }
        return null;
    }

    /*
        Given List<Friend>, filter the ones who are available on Saturday and want to party:
        - getAvailableDay returns "Saturday" and
        - getActivity returns "Party"
        - define predicates and use '.and' method.
    */

    public List<String> partyWithFriends(List<Friend> friends) {
        // Implement me :)
        return null;
    }

    /*
        Return names of sorted bodybuilders.

        Sort List<Bodybuilder> using your custom comparator.

        Write a comparator for type BodyBuilder that will sort bodybuilders by:
        - who can lift more,
        - then who is younger,
        - then name alphabetically.
     */
    public List<String> sortBodybuilders(List<Bodybuilder> bodybuilders) {
        // Implement me :)
        return null;
    }

}
