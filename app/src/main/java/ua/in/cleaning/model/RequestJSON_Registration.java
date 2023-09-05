package ua.in.cleaning.model;

/**
 * Created by root on 30.07.15.
 */

public class RequestJSON_Registration {
      public int userID;
      public boolean boolSelect;

      public RequestJSON_Registration(int muserID,
                                      boolean mboolSelect) {
            userID = muserID;
            boolSelect = mboolSelect;
      }
}