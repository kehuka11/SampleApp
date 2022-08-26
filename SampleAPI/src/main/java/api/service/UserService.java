package api.service;

import domain.entity.UserEntity;
import domain.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    AppUserRepository appUserRepository;


    /**
     * ユーザIDに紐づくユーザ情報を取得
     *
     * */

    public UserEntity getAppUserByUserId(long userId){
        return  appUserRepository.getAppUser(userId);
    }
}
