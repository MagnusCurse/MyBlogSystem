-- Create the database
drop database if exists mycnblog;
create database mycnblog DEFAULT CHARACTER SET utf8mb4;

-- Use the database
use mycnblog;

-- Create the user table
drop table if exists user_info;
create table user_info(
      id int primary key auto_increment,             -- Primary key (auto-incremented)
      username varchar(100) unique,                  -- Unique username
      password varchar(64) not null,                 -- Password (hashed)
      photo varchar(500) default '',                 -- User photo URL or path
      create_time datetime default now(),            -- Account creation time
      update_time datetime default now(),            -- Last account update time
      mail varchar(100) unique,                      -- Unique email address
      nickname varchar(100) unique,                  -- Unique nickname
      introduction varchar(500),                     -- User introduction or bio
      avatar_url varchar(200) default ''             -- URL of the user’s avatar image
) default charset 'utf8mb4';

-- Create the blog table
drop table if exists blog_info;
create table blog_info(
      id int primary key auto_increment,              -- Primary key (auto-incremented)
      title varchar(100) not null,                    -- Blog title
      content text not null,                          -- Blog content
      create_time datetime default now(),             -- Blog creation time
      update_time datetime default now(),             -- Last blog update time
      user_id int not null,                           -- ID of the blog author (foreign key to user_info)
      like_count int default 0,                       -- Number of likes on the blog
      view_count int default 0                        -- Number of views on the blog
) default charset 'utf8mb4';

-- Create the comment table
drop table if exists comment_info;
create table comment_info(
     id int primary key auto_increment,              -- Primary key (auto-incremented)
     parent_id int,                                  -- ID of the parent comment (for replies)
     user_id int,                                    -- ID of the user who made the comment (foreign key to user_info)
     blog_id int,                                    -- ID of the blog being commented on (foreign key to blog_info)
     username varchar(100),                          -- Username of the commenter
     comment varchar(360),                           -- Comment content
     create_time datetime default now(),             -- Comment creation time
     like_count int,                                 -- Number of likes on the comment
     replied_username varchar(100)                   -- Username of the user being replied to
) default charset 'utf8mb4';

-- Create the blog like record table
drop table if exists blog_like_info;
create table blog_like_info(
       id int primary key auto_increment,              -- Primary key (auto-incremented)
       blog_id int not null,                           -- ID of the liked blog (foreign key to blog_info)
       user_id int not null,                           -- ID of the user who liked the blog (foreign key to user_info)
       create_time datetime default now(),             -- Like record creation time
       update_time datetime default now()              -- Like record update time
) default charset 'utf8mb4';

-- Create the follow record table
drop table if exists follow_info;
create table follow_info (
     id int primary key auto_increment,              -- Primary key (auto-incremented)
     user_id int not null,                           -- ID of the follower (foreign key to user_info)
     followed_user_id int not null,                  -- ID of the followed user (foreign key to user_info)
     create_time datetime default now(),             -- Follow record creation time
     update_time datetime default now()              -- Follow record update time
) default charset 'utf8mb4';
