DROP DATABASE IF EXISTS springboot_test;
CREATE DATABASE springboot_test;
USE springboot_test;

# 게시물 테이블 생성
CREATE TABLE article(
                        id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
                        regDate DATETIME NOT NULL,
                        updateDate DATETIME NOT NULL,
                        title VARCHAR(100) NOT NULL,
                        `body` TEXT NOT NULL

);

# 게시물 테스트 데이터 생성
INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = "제목 2",
`body` = '내용 1';

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = "제목 2",
`body` = '내용 2';

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = "제목 3",
`body` = '내용 3';
