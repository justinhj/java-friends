package io.cloudstate.samples.friends;

// import com.example.chat.
// import com.example.shoppingcart.persistence.Domain;
import com.google.protobuf.Empty;
import io.cloudstate.javasupport.crdt.*;
import cloudstate.samples.chat.friends.grpc.*;

/** Friends service is a CRDT entity that takes care of an OrSet of a users friends. */
@CrdtEntity
public class FriendsEntity {

  private final ORSet<Friend> friends;

  // defaultValue = new CR

  // public FriendsEntity(@EntityId String entityId) {
  //   this.entityId = entityId;
  // }
  public FriendsEntity(ORSet<Friend> friends) {
    this.friends = friends;
  }

  @CommandHandler
  public Empty add(FriendRequest req) {
    friends.add(req.getFriend());
    return Empty.getDefaultInstance();
  }


}
