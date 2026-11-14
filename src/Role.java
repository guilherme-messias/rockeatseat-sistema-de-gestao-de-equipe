public enum Role {
    DEVELOPER,
    PRODUCT_MANAGER,
    DEVOPS_ENGINEER;

    public double calculateBonus(double baseSalary) {
        switch (this) {
            case DEVELOPER:
                return baseSalary * 0.10; // 10% bonus for developers
            case PRODUCT_MANAGER:
                return baseSalary * 0.20; // 20% bonus for product managers
            case DEVOPS_ENGINEER:
                return baseSalary * 0.15; // 15% bonus for DevOps engineers
            default:
                throw new IllegalArgumentException("Unknown job title: " + this);
        }

    }
}
