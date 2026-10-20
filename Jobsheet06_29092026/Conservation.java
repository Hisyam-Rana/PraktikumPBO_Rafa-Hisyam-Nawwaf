package Jobsheet06_29092026;

public class Conservation extends Mountain {
    private String endemicSpecies;
    private String speciesType;
    private String protectionStatus;
    private String managingAgency;
    private boolean researchPermitRequired;

    public Conservation(String Name, int Elevation, String Location, 
                                String endemicSpecies, String typeSpecies, String protectionStatus, 
                                String managingAgency, boolean researchPermitRequired) {
        super(Name, Elevation, Location); 
        this.endemicSpecies = endemicSpecies;
        this.speciesType = typeSpecies;
        this.protectionStatus = protectionStatus;
        this.managingAgency = managingAgency;
        this.researchPermitRequired = researchPermitRequired;
    }

    public String getEndemicSpecies() {
        return endemicSpecies;
    }

    public void setEndemicSpecies(String endemicSpecies) { 
        this.endemicSpecies = endemicSpecies; 
    }

    public String getSpeciesType() {
        return speciesType;
    }

    public void setSpeciesType(String typeSpecies) { 
        this.speciesType = typeSpecies; 
    }

    public String getProtectionStatus() {
        return protectionStatus;
    }

    public String getManagingAgency() {
        return managingAgency;
    }

    public boolean isResearchPermitRequired() {
        return researchPermitRequired;
    }

    public void printInfo() {
        System.out.println("\n==================================");
        System.out.println("        CONSERVATION MOUNTAIN   ");
        System.out.println("==================================");
        super.printInfo();
        System.out.println("Spesies         : " + endemicSpecies);
        System.out.println("Tipe Spesies    : " + speciesType);
        System.out.println("Status          : " + protectionStatus);
        System.out.println("Pengelola       : " + managingAgency);
    }

    public String getAccessInfo() {
        return "Akses terbatas dikelola oleh " + managingAgency + 
            " (Izin Riset: " + (researchPermitRequired ? "Wajib" : "Tidak Wajib") + ")";
    }
}