package graphqlclient;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

@GraphQLProperty(name="model", arguments={
        @GraphQLArgument(name="id")
    })
public class Model {
	private String id;
	private String number;
	private Brand brand;
	private Taxonomy[] categories;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public Taxonomy[] getCategories() {
		return categories;
	}

	public void setCategories(Taxonomy[] categories) {
		this.categories = categories;
	}
	 
	
}
