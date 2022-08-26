package domain.entity;

import lombok.Builder;

import javax.persistence.Entity;

@Entity
@Builder
public class UserEntity {

    /** ユーザID */
    private long userId;

    /** ユーザ名（名字） */
    private String lastName;

    /** ユーザ名（名前） */
    private String firstName;

    /** メールアドレス */
    private String email;

    /** アカウント停止フラグ */
    private boolean stopFlg ;
}
