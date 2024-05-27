import { useState } from "react";
import "./css/App.css";

function App() {
  return (
    <>
      <div className="container">
        <div className="title">협력사 이름</div>
        <div className="form">
          <div className="form__container">
            <div className="form__title">고객정보조회</div>
            <div className="form__details">
              이름과 전화번호를 통해 AS 정보를 불러올 수 있어요
            </div>
            <div className="form__input"></div>
          </div>
        </div>
      </div>
    </>
  );
}

export default App;
