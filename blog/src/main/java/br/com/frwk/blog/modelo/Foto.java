package br.com.frwk.blog.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Foto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String url;
    private String alt;
    @ManyToOne
    private Topico topico;

    public Foto() {
    }

    public int hashCode() {
        int prime = true;
        int result = 1;
        int result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Foto other = (Foto)obj;
            if (this.id == null) {
                if (other.id != null) {
                    return false;
                }
            } else if (!this.id.equals(other.id)) {
                return false;
            }

            return true;
        }
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Topico getTopico() {
        return this.topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt() {
        return this.alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}

