// Copyright (c) 2017 PSForever
package net.psforever.objects

import net.psforever.objects.definition.DeployableDefinition

class BoomerDeployable(cdef : DeployableDefinition) extends ExplosiveDeployable(cdef) {
  private var trigger : Option[BoomerTrigger] = None

  def Trigger : Option[BoomerTrigger] = trigger

  def Trigger_=(item : BoomerTrigger) : Option[BoomerTrigger] = {
    if(trigger.isEmpty) { //can only set trigger once
      trigger = Some(item)
    }
    Trigger
  }

  def Trigger_=(item : Option[BoomerTrigger]) : Option[BoomerTrigger] = {
    if(item.isEmpty) {
      trigger = None
    }
    Trigger
  }
}
