package bsu.fpmi.profit;

import java.util.*;

public class AdItem {

    private final String id;
    private String label;
    private String description;
    private final Date createdAt;
    private String link;
    private final String vendor;
    private String photoLink;
    private List<String> hashTags;
    private String discount;
    private Date validUntil;
    private double rating;
    private List<String> reviews;

    public AdItem(String id, String label, String description, Date createdAt, String link, String vendor,
                  String photoLink, List<String> hashTags, String discount, Date validUntil,
                  double rating, List<String> reviews) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.createdAt = createdAt;
        this.link = link;
        this.vendor = vendor;
        this.photoLink = photoLink;
        this.hashTags = hashTags;
        this.discount = discount;
        this.validUntil = validUntil;
        this.rating = rating;
        this.reviews = reviews;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public void setHashTags(List<String> hashTags) {
        this.hashTags = hashTags;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getLink() {
        return link;
    }

    public String getVendor() {
        return vendor;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public List<String> getHashTags() {
        return hashTags;
    }

    public String getDiscount() {
        return discount;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public double getRating() {
        return rating;
    }

    public List<String> getReviews() {
        return reviews;
    }
}