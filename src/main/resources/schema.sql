drop table translation_entry;
drop table word;
drop table topic;
drop table language;



CREATE TABLE language(
    language_id BIGSERIAL NOT NULL Primary Key,
    name VARCHAR(15) NOT NULL UNIQUE
);

CREATE TABLE topic (
    topic_id BIGSERIAL NOT NULL primary key,
    name varchar(30) not null unique,
    language_id BIGINT not null references language(language_id)
);

CREATE TABLE word(
    word_id BIGSERIAL NOT NULL primary key,
    word_name varchar(30) not null,
    language_id bigint not null references language(language_id)
);

CREATE TABLE translation_entry(
    id BIGSERIAL NOT NULL primary key,
    word1_id BIGINT NOT NULL references word(word_id),
    word2_id bigint NOT NULL references word(word_id),
    topic_id BIGINT NOT NULL references topic(topic_id)
);