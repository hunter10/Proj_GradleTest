using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class nativetest : MonoBehaviour {

    public Text msg;

	public void CallFromNative(string _strLog)
    {
        msg.text = _strLog;
        Debug.Log(_strLog);
    }
}
