public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Bag(long amount) {
        this(null, amount);
    }

    public boolean hasTicket() {
        return this.ticket != null;
    }

    public boolean hasInvitation() {
        return this.invitation != invitation;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
