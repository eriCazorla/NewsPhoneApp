package com.ecreation.newsphoneapp.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {

    String status;
    int totalResults;
    List<com.ecreation.newsphoneapp.Models.NewsHeadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<com.ecreation.newsphoneapp.Models.NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<com.ecreation.newsphoneapp.Models.NewsHeadlines> articles) {
        this.articles = articles;
    }
}
