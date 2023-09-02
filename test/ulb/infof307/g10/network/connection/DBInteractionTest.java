package ulb.infof307.g10.network.connection;

import org.junit.jupiter.api.Test;
import ulb.infof307.g10.constante.networkConst.ConstServerError;
import ulb.infof307.g10.constante.networkConst.ConstServerRequest;
import ulb.infof307.g10.constante.networkConst.ConstServerSuccess;
import ulb.infof307.g10.network.packet.Packet;

import static org.junit.jupiter.api.Assertions.*;

class DBInteractionTest {
    DBAccountInteraction dbAI = new DBAccountInteraction("");

    @Test
    void getStatePacketTest() {
        Packet p =dbAI.getStatePacket(true, ConstServerSuccess.LOGIN_SUCCESS, ConstServerError.ACCOUNT_NOT_EXIST);
        assertEquals(p.getRequest(), ConstServerRequest.SUCCESS);

    }


}