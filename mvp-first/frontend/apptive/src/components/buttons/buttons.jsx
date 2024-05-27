import "./buttons.css";
import React, { useState } from "react";

function Buttons() {
  let [loading, setLoading] = useState(false);
  let [error, setError] = useState(false);

  return (
    <div
      className={
        "button" + (loading ? " loading" : error ? " error" : " default")
      }
      onClick={() => {
        setLoading(true);
        setTimeout(() => {
          setLoading(false);
          setError(true);
          setTimeout(() => {
            setError(false);
          }, 1000);
        }, 1000);
      }}
    >
      {loading
        ? "정보를 불러오고 있어요"
        : error
        ? "정보가 일치하지 않아요"
        : "조회하기"}
    </div>
  );
}

export default Buttons;
