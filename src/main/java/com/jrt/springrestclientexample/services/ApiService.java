package com.jrt.springrestclientexample.services;

import com.jrt.springrestclientexample.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
