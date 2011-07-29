
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.mock_impl;

import com.rapleaf.jack.test_project.database_1.IDatabase1;
import com.rapleaf.jack.test_project.database_1.iface.ICommentPersistence;
import com.rapleaf.jack.test_project.database_1.iface.IImagePersistence;
import com.rapleaf.jack.test_project.database_1.iface.IPostPersistence;
import com.rapleaf.jack.test_project.database_1.iface.IUserPersistence;

import com.rapleaf.jack.test_project.IDatabases;

public class MockDatabase1Impl implements IDatabase1 {
  private final ICommentPersistence comments;
  private final IImagePersistence images;
  private final IPostPersistence posts;
  private final IUserPersistence users;

  public MockDatabase1Impl(IDatabases databases) {
    this.comments = new BaseMockCommentPersistenceImpl(databases);
    this.images = new BaseMockImagePersistenceImpl(databases);
    this.posts = new BaseMockPostPersistenceImpl(databases);
    this.users = new BaseMockUserPersistenceImpl(databases);
  }

  public ICommentPersistence comments(){
    return comments;
  }

  public IImagePersistence images(){
    return images;
  }

  public IPostPersistence posts(){
    return posts;
  }

  public IUserPersistence users(){
    return users;
  }
}