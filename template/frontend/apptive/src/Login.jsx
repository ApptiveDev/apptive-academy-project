import React, { useState } from 'react';

function Login() {
  const [nameValue, setNameValue] = useState('');
  const [numberValue, setNumberValue] = useState('');
  const [isLoading, setIsLoading] = useState(false);
  const [noData, setNoData] = useState(false);
  const [isActive, setIsActive] = useState(false);
  
  const nameChange = (e) => {
    setNameValue(e.target.value);
    validationCheck(e.target.value, numberValue);
    setNoData(false);
  };

  const numberChange = (e) => {
    setNumberValue(e.target.value);
    validationCheck(nameValue, e.target.value);
    setNoData(false);
  };

  const validationCheck = (name, number)=>{
    if (name.length > 0 && number.length === 11) {
      setIsActive(true);
    }
    else{
      setIsActive(false);
    }
  };

  const clickLogin = () => {
    setIsLoading(true);
    setNoData(false);
    setTimeout(() => {
      setIsLoading(false);
      setNoData(true);
    }, 2000);
  };

  const changeButtonClass = () => {
    if(isLoading) return 'login-button-loading';
    if(noData) return 'login-button-disabled';
    return isActive ? 'login-button' : 'login-button-disabled';
  };
  
  const changeButtonText = () => {
    if(isLoading) return "정보를 찾는 중입니다";
    if(noData) return "일치하는 정보가 없습니다";
    return "조회하기"
  };

  return(
    <div className="layout">
      <img className = "background-img" src="\background-mvp.png" alt="background"/>
      <span className="h-name">협력사 이름</span>
      <div className="login-container">
        <div className="login-header">고객 정보 조회</div>
        <div className="login-header-ex">이름과 전화번호를 통해 AS 정보를 불러올 수 있어요</div>
        <form>
          <div className='user-name'>
            <input
              type = "text"
              id  = "user-name"
              placeholder="이름"
              value = {nameValue}
              onChange={nameChange}
              name="nameValue"
            ></input>
          </div>
          <div className="user-number">
            <input
            type="text"
            id ="user-number"
            placeholder="전화번호"
            value = {numberValue}
            onChange = {numberChange}
            name="numberValue"
            ></input>
          </div>
          <div>
            <button
            type="button"
            onClick= {clickLogin}
            className={changeButtonClass()}
            disabled={isLoading || !isActive}
            >{changeButtonText()}</button>
          </div>
        </form>
      </div>
    </div>
  )
}

export default Login;