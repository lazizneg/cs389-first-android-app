package com.example.myfirstapp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SecondFragmentDirections {
  private SecondFragmentDirections() {
  }

  @NonNull
  public static ActionSecondFragmentToFirstFragment actionSecondFragmentToFirstFragment(int myArg) {
    return new ActionSecondFragmentToFirstFragment(myArg);
  }

  public static class ActionSecondFragmentToFirstFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSecondFragmentToFirstFragment(int myArg) {
      this.arguments.put("myArg", myArg);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSecondFragmentToFirstFragment setMyArg(int myArg) {
      this.arguments.put("myArg", myArg);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("myArg")) {
        int myArg = (int) arguments.get("myArg");
        __result.putInt("myArg", myArg);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_SecondFragment_to_FirstFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMyArg() {
      return (int) arguments.get("myArg");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSecondFragmentToFirstFragment that = (ActionSecondFragmentToFirstFragment) object;
      if (arguments.containsKey("myArg") != that.arguments.containsKey("myArg")) {
        return false;
      }
      if (getMyArg() != that.getMyArg()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getMyArg();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSecondFragmentToFirstFragment(actionId=" + getActionId() + "){"
          + "myArg=" + getMyArg()
          + "}";
    }
  }
}
