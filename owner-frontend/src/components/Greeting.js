import React, { useState, useEffect } from 'react';
import '../App.css';

const Greeting = () => {
  const [greeting, setGreeting] = useState('');

  useEffect(() => {
    const updateGreeting = () => {
      const now = new Date();
      const hour = now.getHours();

      if (hour >= 0 && hour < 12) {
        setGreeting('Good Morning Owner');
      } else if (hour >= 12 && hour < 16) {
        setGreeting('Good Afternoon Owner');
      } else {
        setGreeting('Good Evening Owner');
      }
    };

    updateGreeting();
    setInterval(updateGreeting, 60000); // Update every minute
  }, []);

  return <div className='greeting'>{greeting}</div>;
};

export default Greeting;