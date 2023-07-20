package jp.kobe_u.cs.daikibo.tsubuyaki.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.jpa.repository.Temporal;

import lombok.Data;

@Data
@Entity  
public class Tsubuyaki {
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; //つぶやきエンティティの識別子
    String name;    //名前
    String comment; //コメント
    @Temporal(TemporalType.TIMESTAMP)
    Date createdAt; //作成日時
    public void searchWord(String word) {
    }

  
}

