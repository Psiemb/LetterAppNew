package userletters.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "Letter")
public class Letter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sender_id", referencedColumnName = "id")
    private Sender sender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "senderAddress_id", referencedColumnName = "id")
    private SenderAddress senderAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiver_id", referencedColumnName = "id")
    private Receiver receiver;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiverAddress_id", referencedColumnName = "id")
    private ReceiverAddress receiverAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "createdAt_id", referencedColumnName = "id")
    private CreatedAt createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "update_id", referencedColumnName = "id")
    private UpdatedAt updatedAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "information_id", referencedColumnName = "id")
    private Information information;

    public Letter() {
    }

    public Letter(Sender sender, SenderAddress senderAddress, Receiver receiver, ReceiverAddress receiverAddress, CreatedAt createdAt, UpdatedAt updatedAt, Information information) {
        this.sender = sender;
        this.senderAddress = senderAddress;
        this.receiver = receiver;
        this.receiverAddress = receiverAddress;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.information = information;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public SenderAddress getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(SenderAddress senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public ReceiverAddress getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(ReceiverAddress receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(CreatedAt createdAt) {
        this.createdAt = createdAt;
    }

    public UpdatedAt getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(UpdatedAt updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }
}
