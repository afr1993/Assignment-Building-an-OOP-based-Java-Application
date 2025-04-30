public class PremiumMember extends Member {
    public PremiumMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public int getMaxBooks() {
        return 5;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "(Premium Member)\n";
    }
}
