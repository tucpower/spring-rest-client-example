package com.jrt.springrestclientexamples.services;

import com.jrt.springrestclientexamples.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
