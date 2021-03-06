package com.axellience.vuegwt.testsapp.client.components.basic.prop;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.testsapp.client.common.SimpleObject;
import elemental2.core.JsArray;

@Component
public class PropTestComponent implements IsVueComponent {

  @Prop
  int optionalProp;

  @Prop(required = true)
  SimpleObject requiredProp;

  @Prop
  SimpleObject nonObservedProp;

  @Prop
  boolean booleanPropTrue;

  @Prop
  boolean booleanPropFalse;

  @Prop
  Boolean booleanObjectPropTrue;

  @Prop
  Boolean booleanObjectPropNull;

  @Prop
  JsArray<String> stringArray;
}
