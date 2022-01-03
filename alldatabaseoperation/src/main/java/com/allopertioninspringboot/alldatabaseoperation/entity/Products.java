package com.allopertioninspringboot.alldatabaseoperation.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Products implements Serializable {
	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ProductId;
	private String Name, ShortDesp, FullDesp, Size, Colour;

	@ManyToMany(cascade = CascadeType.ALL)
	private Stroes stroes;

	public Long getProductId() {
		return ProductId;
	}

	public void setProductId(Long productId) {
		ProductId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getShortDesp() {
		return ShortDesp;
	}

	public void setShortDesp(String shortDesp) {
		ShortDesp = shortDesp;
	}

	public String getFullDesp() {
		return FullDesp;
	}

	public void setFullDesp(String fullDesp) {
		FullDesp = fullDesp;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public Stroes getStores() {
		return stroes;
	}

	public void setStores(Stroes stores) {
		this.stroes = stores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Colour, FullDesp, Name, ProductId, ShortDesp, Size, stroes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(Colour, other.Colour) && Objects.equals(FullDesp, other.FullDesp)
				&& Objects.equals(Name, other.Name) && Objects.equals(ProductId, other.ProductId)
				&& Objects.equals(ShortDesp, other.ShortDesp) && Objects.equals(Size, other.Size)
				&& Objects.equals(stroes, other.stroes);
	}

	@Override
	public String toString() {
		return "Products [ProductId=" + ProductId + ", Name=" + Name + ", ShortDesp=" + ShortDesp + ", FullDesp="
				+ FullDesp + ", Size=" + Size + ", Colour=" + Colour + ", stores=" + stroes + "]";
	}

}
