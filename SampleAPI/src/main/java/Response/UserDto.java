package Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {

    /** ユーザID */
    @JsonProperty("userId")
    private long userId;

    /** ユーザ名（名字） */
    @JsonProperty("lastName")
    private String lastName;

    /** ユーザ名（名前） */
    @JsonProperty("firstName")
    private String firstName;

    /** メールアドレス */
    @JsonProperty("email")
    private String email;

    /** アカウント停止フラグ */
    @JsonProperty("stopFlg")
    private boolean stopFlg ;
}
