package com.dera.spring.test.cronjob.service;




import com.dera.spring.test.cronjob.dao.UserDao;
import com.dera.spring.test.cronjob.model.UserModel;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao dao;
    
    Logger log = LoggerFactory.getLogger(UserService.class);
    //schedule job to add object in DB
    @Scheduled(fixedRate=5000)
    public void addToDBJob(){
      System.out.println("Add Service call in "+new Date().toString());
      UserModel user = new UserModel(0,"dera"+ new Random().nextInt(3744883));
      dao.save(user);
    }
    @Scheduled(cron = "0/15 * * * * *")
    public void fetchDBJob(){
        List<UserModel> users=dao.findAll();
        System.out.println("Fetch Service call in "+ new Date().toString());
        System.out.println("no of record fetched : "+ users.size());
        log.info("users : {}", users);
    }
}

