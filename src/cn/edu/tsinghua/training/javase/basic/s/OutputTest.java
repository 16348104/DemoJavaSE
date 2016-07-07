package cn.edu.tsinghua.training.javase.basic.s;

import java.io.*;

/**
 * Created at 221
 * 16-7-7 下午2:40.
 */
public class OutputTest {
    public static void main(String[] args) {
        User user = new User(1, "username", 1.8, true);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.data"))) {
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.data"))) {
            User u = (User) objectInputStream.readObject();
            System.out.println(u);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
