package com.example.myapplication.Database.Controller;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.Database.Object.Bill;
import com.example.myapplication.Database.Object.Partner;
import com.example.myapplication.Database.Object.Service;
import com.example.myapplication.Database.Object.User;

import java.util.List;

@Dao
public  interface MyDAO {

    //------------User-----------------

    @Insert
    public void addUser(User user);

    @Query("select * from users where userName = :userName AND userPassword = :pass")
    public User getUser(String userName, String pass);

    @Query("select * from users where userName = :userName")
    public User getUserByUsName(String userName);

    @Query("select * from users")
    public List<User> getUsers();

    @Update
    public void updateUser(User user);

    @Delete
    public void deleteUser(User user);

    //------------Partner-----------------

    @Insert
    public void addPartner(Partner partner);

    @Query("select * from partners")
    public List<Partner> getPartner();

    @Query("select partnerID from serviceOfPartner where serviceID = :serviceID")
    public List<Integer> getPartner(int serviceID);

    //------------Service-----------------

    @Insert
    public void addService(Service service);

    //------------Bill-----------------

    @Insert
    public void addBill(Bill bill);


    //------------ServiceOfPartner-----------------








    //@Query("select * from bills where userID = :userId")
    //public void getBill(int userId);


}