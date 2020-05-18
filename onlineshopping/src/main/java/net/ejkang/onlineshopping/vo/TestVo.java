package net.ejkang.onlineshopping.vo;

public class TestVo {
    private Long mbrNo;
    private String id;
    private String name;
    private boolean userClickHome;
    private boolean userClickAbout;
    private boolean userClickContact;

    public Long getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(Long mbrNo) {
        this.mbrNo = mbrNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUserClickHome() {
        return userClickHome;
    }

    public void setUserClickHome(boolean userClickHome) {
        this.userClickHome = userClickHome;
    }

    public boolean isUserClickAbout() {
        return userClickAbout;
    }

    public void setUserClickAbout(boolean userClickAbout) {
        this.userClickAbout = userClickAbout;
    }

    public boolean isUserClickContact() {
        return userClickContact;
    }

    public void setUserClickContact(boolean userClickContact) {
        this.userClickContact = userClickContact;
    }

}