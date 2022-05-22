/**
 * generated by Xtext 2.27.0.M2
 */
package br.ufscar.dc.compiladores.alguma.alguma.impl;

import br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage;
import br.ufscar.dc.compiladores.alguma.alguma.Comando;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoRepeticao;
import br.ufscar.dc.compiladores.alguma.alguma.ExpressaoRelacional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comando Repeticao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.impl.ComandoRepeticaoImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.impl.ComandoRepeticaoImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComandoRepeticaoImpl extends ComandoImpl implements ComandoRepeticao
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected ExpressaoRelacional exp;

  /**
   * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmd()
   * @generated
   * @ordered
   */
  protected Comando cmd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComandoRepeticaoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlgumaPackage.Literals.COMANDO_REPETICAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoRelacional getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(ExpressaoRelacional newExp, NotificationChain msgs)
  {
    ExpressaoRelacional oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgumaPackage.COMANDO_REPETICAO__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExp(ExpressaoRelacional newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgumaPackage.COMANDO_REPETICAO__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgumaPackage.COMANDO_REPETICAO__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlgumaPackage.COMANDO_REPETICAO__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comando getCmd()
  {
    return cmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmd(Comando newCmd, NotificationChain msgs)
  {
    Comando oldCmd = cmd;
    cmd = newCmd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgumaPackage.COMANDO_REPETICAO__CMD, oldCmd, newCmd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCmd(Comando newCmd)
  {
    if (newCmd != cmd)
    {
      NotificationChain msgs = null;
      if (cmd != null)
        msgs = ((InternalEObject)cmd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgumaPackage.COMANDO_REPETICAO__CMD, null, msgs);
      if (newCmd != null)
        msgs = ((InternalEObject)newCmd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgumaPackage.COMANDO_REPETICAO__CMD, null, msgs);
      msgs = basicSetCmd(newCmd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlgumaPackage.COMANDO_REPETICAO__CMD, newCmd, newCmd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlgumaPackage.COMANDO_REPETICAO__EXP:
        return basicSetExp(null, msgs);
      case AlgumaPackage.COMANDO_REPETICAO__CMD:
        return basicSetCmd(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlgumaPackage.COMANDO_REPETICAO__EXP:
        return getExp();
      case AlgumaPackage.COMANDO_REPETICAO__CMD:
        return getCmd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlgumaPackage.COMANDO_REPETICAO__EXP:
        setExp((ExpressaoRelacional)newValue);
        return;
      case AlgumaPackage.COMANDO_REPETICAO__CMD:
        setCmd((Comando)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlgumaPackage.COMANDO_REPETICAO__EXP:
        setExp((ExpressaoRelacional)null);
        return;
      case AlgumaPackage.COMANDO_REPETICAO__CMD:
        setCmd((Comando)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlgumaPackage.COMANDO_REPETICAO__EXP:
        return exp != null;
      case AlgumaPackage.COMANDO_REPETICAO__CMD:
        return cmd != null;
    }
    return super.eIsSet(featureID);
  }

} //ComandoRepeticaoImpl