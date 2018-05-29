package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user")
public class User {
    private String id;
    private String name;
    private String avatar;
    private String gender;
    private String birthday;
    private String city;
    private String province;
    private String country;
    private String language;
    private long firstLogin;
    private long lastLogin;
    private String unionId;
    private int experience;
    private int newExperience;
    private int score;
    private int newScore;
    private int drawNum;
    private int winNum;
    private int loseNum;
    private String source;
    private int matchNum;
    private int conWinNum;
    private int lastResult;
    private int maxConWinNum;
    private int maxDailyConWinNum;
    private int maxWeeklyConWinNum;
    private int conLoginDays;
    private String introducerId;
    private String originalMaterialId;
    private String currentMaterialId;

    @Id
    @Column(name = "id", unique = true, nullable = false)
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(long firstLogin) {
        this.firstLogin = firstLogin;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public int getWinNum() {
        return winNum;
    }

    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDrawNum() {
        return drawNum;
    }

    public void setDrawNum(int drawNum) {
        this.drawNum = drawNum;
    }

    public int getLoseNum() {
        return loseNum;
    }

    public void setLoseNum(int loseNum) {
        this.loseNum = loseNum;
    }

    public int getNewExperience() {
        return newExperience;
    }

    public void setNewExperience(int newExperience) {
        this.newExperience = newExperience;
    }

    public int getNewScore() {
        return newScore;
    }

    public void setNewScore(int newScore) {
        this.newScore = newScore;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getMatchNum() {
        return matchNum;
    }

    public void setMatchNum(int matchNum) {
        this.matchNum = matchNum;
    }

    public int getConWinNum() {
        return conWinNum;
    }

    public void setConWinNum(int conWinNum) {
        this.conWinNum = conWinNum;
    }

    public int getLastResult() {
        return lastResult;
    }

    public void setLastResult(int lastResult) {
        this.lastResult = lastResult;
    }

    public int getMaxConWinNum() {
        return maxConWinNum;
    }

    public void setMaxConWinNum(int maxConWinNum) {
        this.maxConWinNum = maxConWinNum;
    }

    public int getMaxDailyConWinNum() {
        return maxDailyConWinNum;
    }

    public void setMaxDailyConWinNum(int maxDailyConWinNum) {
        this.maxDailyConWinNum = maxDailyConWinNum;
    }

    public int getMaxWeeklyConWinNum() {
        return maxWeeklyConWinNum;
    }

    public void setMaxWeeklyConWinNum(int maxWeeklyConWinNum) {
        this.maxWeeklyConWinNum = maxWeeklyConWinNum;
    }

    public int getConLoginDays() {
        return conLoginDays;
    }

    public void setConLoginDays(int conLoginDays) {
        this.conLoginDays = conLoginDays;
    }

    public String getIntroducerId() {
        return introducerId;
    }

    public void setIntroducerId(String introducerId) {
        this.introducerId = introducerId;
    }

    public String getOriginalMaterialId() {
        return originalMaterialId;
    }

    public void setOriginalMaterialId(String originalMaterialId) {
        this.originalMaterialId = originalMaterialId;
    }

    public String getCurrentMaterialId() {
        return currentMaterialId;
    }

    public void setCurrentMaterialId(String currentMaterialId) {
        this.currentMaterialId = currentMaterialId;
    }
}
