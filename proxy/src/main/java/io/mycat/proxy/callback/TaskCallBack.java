package io.mycat.proxy.callback;

import io.mycat.MycatExpection;
import io.mycat.beans.mysql.packet.ErrorPacket;

/**
 * @author jamie12221
 *  date 2019-05-21 01:21
 **/
public interface TaskCallBack<T extends TaskCallBack> {

  default Exception toExpection(ErrorPacket errorPacket) {
    byte[] errorMessage = errorPacket.getErrorMessage();
    return new MycatExpection(new String(errorMessage));
  }
}
