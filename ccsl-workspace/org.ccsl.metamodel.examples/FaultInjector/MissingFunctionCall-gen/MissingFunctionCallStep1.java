import org.eclipse.gmt.modisco.java.*;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.*;

public class MissingFunctionCallStep1 implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    return root;
  }

  @Override
  public boolean doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      return new DeleteNodeCommand().doAction(target);
    }
    return false;
  }
}