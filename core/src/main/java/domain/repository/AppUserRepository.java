package domain.repository;

import domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<UserEntity, Long> {

    /** ユーザ情報取得 */
    UserEntity getAppUser(long userId );
}
