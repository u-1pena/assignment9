DROP TABLE IF EXISTS todos;

CREATE TABLE todos (
  id int unsigned AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  completed TINYINT(1) NOT NULL,

  PRIMARY KEY(id)
);

INSERT INTO todos (title, completed) VALUES ("会議書類作成", "0");
INSERT INTO todos (title, completed) VALUES ("山田さんへ実績報告", "0");
INSERT INTO todos (title, completed) VALUES ("シフト作成", "1");
