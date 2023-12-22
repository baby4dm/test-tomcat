package bgd.edu.ua.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersDto {
    @JsonProperty
    Long userId;
    @JsonProperty
    String userName;

    @Override
    public String toString() {
        return super.toString();
    }
}
