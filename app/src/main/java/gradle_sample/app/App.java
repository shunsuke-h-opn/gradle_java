/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle_sample.app;

// import gradle_sample.list.LinkedList;

// import static gradle_sample.utilities.StringUtils.join;
// import static gradle_sample.utilities.StringUtils.split;
// import static gradle_sample.app.MessageUtils.getMessage;

// import org.apache.commons.text.WordUtils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //追加
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);  //修正
    }
}