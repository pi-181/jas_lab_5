package com.demkom58.jaslab5.service.impl;

import com.demkom58.jaslab3.model.GroupSubscription;
import com.demkom58.jaslab4.config.Database;
import com.demkom58.jaslab5.service.RepositoryService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demkom58.jaslab5.service.SimpleService")
public class GroupSubscriptionService extends RepositoryService<GroupSubscription> {

    public GroupSubscriptionService() {
        super(Database.getDatabase().getGroupSubscriptionRepository(), () -> new GroupSubscription[0]);
    }

}
