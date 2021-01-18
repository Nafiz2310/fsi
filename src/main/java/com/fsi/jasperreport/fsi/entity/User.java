package com.fsi.jasperreport.fsi.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "sys_userinfo")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private String userid;

    @Column(name = "firstname")
    private String firstname ;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "username")
    private String username ;


    @Column(name = "password")
    private String password;

    @Column(name = "defaultbranchcode")
    private String defaultbranchcode;

    @Column(name = "email")
    private String email ;


    @Column(name = "employeeid")
    private String employeeid ;

    @Column(name = "usrcreationdate")
    private Date usrcreationdate;

    @Column(name = "pwdchangedyn")
    private String pwdchangedyn;

    @Column(name = "USRFORETHYN")
    private String usrforethyn ;

    @Column(name = "userlockstatus")
    private String userlockstatus;

    @Column(name = "statusid")
    private String statusid;

    @Column(name = "createdby")
    private String createdby;


    @Column(name = "creationdate")
    private Date creationdate ;

    @Column(name = "modifiedby")
    private String modifiedby;

    @Column(name = "modificationdate")
    private Date modificationdate;


    @Column(name = "remarks")
    private String remarks;

    public User(String userid, String firstname, String lastname, String username, String password, String defaultbranchcode, String email, String employeeid, Date usrcreationdate, String pwdchangedyn, String usrforethyn, String userlockstatus, String statusid, String createdby, Date creationdate, String modifiedby, Date modificationdate, String remarks) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.defaultbranchcode = defaultbranchcode;
        this.email = email;
        this.employeeid = employeeid;
        this.usrcreationdate = usrcreationdate;
        this.pwdchangedyn = pwdchangedyn;
        this.usrforethyn = usrforethyn;
        this.userlockstatus = userlockstatus;
        this.statusid = statusid;
        this.createdby = createdby;
        this.creationdate = creationdate;
        this.modifiedby = modifiedby;
        this.modificationdate = modificationdate;
        this.remarks = remarks;
    }

    public User() {

    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDefaultbranchcode() {
        return defaultbranchcode;
    }

    public void setDefaultbranchcode(String defaultbranchcode) {
        this.defaultbranchcode = defaultbranchcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getUsrcreationdate() {
        return usrcreationdate;
    }

    public void setUsrcreationdate(Date usrcreationdate) {
        this.usrcreationdate = usrcreationdate;
    }

    public String getUsrforethyn() {
        return usrforethyn;
    }

    public void setUsrforethyn(String usrforethyn) {
        this.usrforethyn = usrforethyn;
    }

    public String getUserlockstatus() {
        return userlockstatus;
    }

    public void setUserlockstatus(String userlockstatus) {
        this.userlockstatus = userlockstatus;
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public String getPwdchangedyn() {
        return pwdchangedyn;
    }

    public void setPwdchangedyn(String pwdchangedyn) {
        this.pwdchangedyn = pwdchangedyn;
    }


    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getModificationdate() {
        return modificationdate;
    }

    public void setModificationdate(Date modificationdate) {
        this.modificationdate = modificationdate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
