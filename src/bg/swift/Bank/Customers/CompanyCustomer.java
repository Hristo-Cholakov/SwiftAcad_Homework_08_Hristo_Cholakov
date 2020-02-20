package bg.swift.Bank.Customers;

public class CompanyCustomer {
    private String companyCustomerName;

    public CompanyCustomer(String companyCustomerName) {
        this.companyCustomerName = companyCustomerName;
    }

    public String getCompanyCustomerName() {
        return companyCustomerName.getClass().getSimpleName();
    }
}
