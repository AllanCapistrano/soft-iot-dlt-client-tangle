package dlt.client.tangle.model.transactions;

import dlt.client.tangle.enums.TransactionType;

/**
 * @author Allan Capistrano
 */
public class Evaluation extends Transaction {

  private final int value;

  public Evaluation(
    String source,
    String target,
    TransactionType type,
    int value
  ) {
    super(source, target, type);
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public String getTarget() {
    return this.getGroup();
  }
}
