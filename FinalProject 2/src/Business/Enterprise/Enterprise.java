         /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author srivaishnaviaekkati
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public enum EnterpriseType
    {
        ResidentialHall("ResidentialHall"),
        Police("Police");
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
        return value;
        }
    }
    
    public abstract ArrayList<Type> getOrganizations();
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type) {
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
