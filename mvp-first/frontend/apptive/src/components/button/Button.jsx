import React from "react";
import "./Button.css";

function Button({ children, ...rest }) {
  return (
    <button className="button" {...rest}>
      {children}
    </button>
  );
}

export default Button;
