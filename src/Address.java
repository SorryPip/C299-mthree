import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Address {
	String Country;
	public Address(String address) {
		// TODO Auto-generated constructor stub
		String addressList = Arrays.asList(address.split(","))
				.stream().filter(x -> x.contains("Country"))
				.collect(Collectors.toList()).get(0);
		
		this.Country = addressList.replace("Country", "").trim();
	}
	
	public String getCountry() {
		return Country;
	}

}
