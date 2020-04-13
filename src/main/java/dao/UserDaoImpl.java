package dao;

import api.UserDao;
import entity.User;
import util.FileUtils;


import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    String nameFile;

    public UserDaoImpl(String nameFile) throws IOException {
        this.nameFile=nameFile;
        FileUtils.createFile(nameFile);
    }
    @Override
    public void saveUser(User user) throws IOException {
        List<User> listOfUsers = getAllUsers();
        listOfUsers.add(user);
        saveUser(listOfUsers);
    }
    @Override
    public void saveUser(List<User> users) throws IOException {
        FileUtils.clearFile(nameFile);
        List<User> listOfUsers = getAllUsers();
        FileOutputStream fileOutputStream=new FileOutputStream(nameFile);
        PrintWriter printWriter=new PrintWriter(fileOutputStream);
        for(User user:listOfUsers){
            printWriter.write(user.toString()+"\n");
        }
        printWriter.close();
        fileOutputStream.close();
    }
    @Override
    public List<User> getAllUsers() throws IOException {
        FileReader fileReader = new FileReader(nameFile);
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        List<User> listOfUsers = new ArrayList<User>();
        String readLine=bufferedReader.readLine();
        while(readLine!=null){
            String [] values = readLine.split(User.userRegex);
            listOfUsers.add(new User(Long.parseLong(values[0]),values[1],values[2]));
            readLine=bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
        return listOfUsers;
    }
    @Override
    public User getUserByLogin(String login) throws IOException {
        List<User> listOfUsers = this.getAllUsers();
        for(User user: listOfUsers){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }
    @Override
    public User getUserById(Long userId) throws IOException {
        List<User> listOfUsers=this.getAllUsers();
        for(User user: listOfUsers){
            if(user.getId().equals(userId)){
                return user;
            }
        }
        return null;
    }
    @Override
    public void removeUserByLogin(String login) throws IOException {
        List<User> listOfUsers = this.getAllUsers();
        for(int i=0; i<listOfUsers.size();i++){
            if(listOfUsers.get(i).getLogin().equals(login)){
                listOfUsers.remove(i);
            }
        }
        saveUser(listOfUsers);
    }
    @Override
    public void removeUserById(Long id) throws IOException {
        List<User> listOfUsers =this.getAllUsers();
        for(int i=0; i<listOfUsers.size(); i++){
            if(listOfUsers.get(i).getId().equals(id)){
                listOfUsers.remove(i);
            }
        }
        saveUser(listOfUsers);
    }
}
