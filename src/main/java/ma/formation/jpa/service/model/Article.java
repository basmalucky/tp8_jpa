//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ma.formation.jpa.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private Double quantite;
    private Double price;

    public static ArticleBuilder builder() {
        return new ArticleBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Double getQuantite() {
        return this.quantite;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Article)) {
            return false;
        } else {
            Article other = (Article)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label59;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label59;
                    }

                    return false;
                }

                Object this$quantite = this.getQuantite();
                Object other$quantite = other.getQuantite();
                if (this$quantite == null) {
                    if (other$quantite != null) {
                        return false;
                    }
                } else if (!this$quantite.equals(other$quantite)) {
                    return false;
                }

                Object this$price = this.getPrice();
                Object other$price = other.getPrice();
                if (this$price == null) {
                    if (other$price != null) {
                        return false;
                    }
                } else if (!this$price.equals(other$price)) {
                    return false;
                }

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Article;
    }

    public int hashCode() {
        //int PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $quantite = this.getQuantite();
        result = result * 59 + ($quantite == null ? 43 : $quantite.hashCode());
        Object $price = this.getPrice();
        result = result * 59 + ($price == null ? 43 : $price.hashCode());
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Article(id=" + var10000 + ", description=" + this.getDescription() + ", quantite=" + this.getQuantite() + ", price=" + this.getPrice() + ")";
    }

    public Article() {
    }

    public Article(Long id, String description, Double quantite, Double price) {
        this.id = id;
        this.description = description;
        this.quantite = quantite;
        this.price = price;
    }

    public static class ArticleBuilder {
        private Long id;
        private String description;
        private Double quantite;
        private Double price;

        ArticleBuilder() {
        }

        public ArticleBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ArticleBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ArticleBuilder quantite(Double quantite) {
            this.quantite = quantite;
            return this;
        }

        public ArticleBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public Article build() {
            return new Article(this.id, this.description, this.quantite, this.price);
        }

        public String toString() {
            return "Article.ArticleBuilder(id=" + this.id + ", description=" + this.description + ", quantite=" + this.quantite + ", price=" + this.price + ")";
        }
    }
}
